package wicket.extensions.markup.html.repeater.data.table.filter;

import wicket.extensions.markup.html.repeater.data.table.PropertyColumn;
import wicket.model.IModel;
import wicket.model.PropertyModel;

/**
 * Like {@link PropertyColumn} but with support for filters.
 * 
 * @see PropertyColumn
 * @see IFilteredColumn
 * 
 * @author Igor Vaynberg (ivaynberg)
 * 
 */
public abstract class FilteredPropertyColumn extends PropertyColumn implements IFilteredColumn
{
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor
	 * 
	 * @param displayModel
	 *            model used to construct header text
	 * @param sortProperty
	 *            sort property this column represents, if null this column will
	 *            not be sortable
	 * @param propertyExpression
	 *            wicket property expression for the column, see
	 *            {@link PropertyModel} for details
	 */
	public FilteredPropertyColumn(IModel displayModel, String sortProperty,
			String propertyExpression)
	{
		super(displayModel, sortProperty, propertyExpression);
	}

	/**
	 * @param displayModel
	 *            model used to construct header text
	 * @param propertyExpression
	 *            wicket property expression for the column, see
	 *            {@link PropertyModel} for details
	 */
	public FilteredPropertyColumn(IModel displayModel, String propertyExpression)
	{
		super(displayModel, propertyExpression);
	}

}
