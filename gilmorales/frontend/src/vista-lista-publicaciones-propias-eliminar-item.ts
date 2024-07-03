import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-checkbox/src/vaadin-checkbox.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-lista-publicaciones-propias-eliminar-item')
export class VistaListaPublicacionesPropiasEliminarItem extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="justify-content: flex-start; align-items: flex-start;" id="layoutItem" theme="spacing-s">
 <vaadin-vertical-layout id="layoutPublicacion" style="flex-grow: 0; overflow: hidden; flex-shrink: 0; width: 300px; background-color: black; color: white; border-radius: 10px; box-shadow: 5px 5px 15px rgba(0, 0, 0, 0.2); align-self: center; align-items: center; height: 300px;">
  <vaadin-vertical-layout id="layoutVideo" style="flex-shrink: 0; flex-grow: 0; align-items: center; width: 100%; height: 90%;"></vaadin-vertical-layout>
  <vaadin-horizontal-layout theme="spacing" style="color: white;">
   <label id="numVisualizaciones">0</label>
   <label>Visualizaciones</label>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-checkbox id="checkboxEliminar" style="flex-grow: 0; flex-shrink: 0; border-radius: 10px; border: 2px solid #F5F5F5; padding: var(--lumo-space-s); align-self: center;">
   Eliminar 
 </vaadin-checkbox>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
