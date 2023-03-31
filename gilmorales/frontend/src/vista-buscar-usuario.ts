import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-buscar-usuario')
export class VistaBuscarUsuario extends LitElement {
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
<vaadin-vertical-layout id="layoutRealizarBusqueda" style="flex-grow: 1; margin: var(--lumo-space-s);">
 <vaadin-vertical-layout id="layoutBuscarUsuario" style="flex-grow: 1; margin: var(--lumo-space-xs); align-self: stretch;">
  <vaadin-horizontal-layout id="layoutTituloUsuarios" style="flex-grow: 0; justify-content: center; margin: var(--lumo-space-m); width: 100%;">
   <h3 id="tituloUsuarios">Usuarios</h3>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout id="layoutListaResultadoUsuarios" style="align-self: stretch; margin: var(--lumo-space-s); justify-content: center;"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
